/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cheenbabes.googlegeocoder;

import com.google.code.geocoder.Geocoder;
import com.google.code.geocoder.GeocoderRequestBuilder;
import com.google.code.geocoder.model.GeocoderRequest;
import com.google.code.geocoder.model.GeocodeResponse;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ebaibourine
 */
public class GeocoderController {

    private static final String DELIMITER = ",";
    final Geocoder geocoder = new Geocoder();

    public static void main(String[] args) throws Exception {
        Decoder decoder = new Decoder();
        final Geocoder geocoder = new Geocoder();
        GeocoderController controller = new GeocoderController();
        List<BookScore> scores = controller.readDataFromCSV("cities_cum_2010csv.txt");
        controller.printData(scores);
        controller.getAddresses(scores);
        controller.createCSV(scores);
        //grab the data
        //convert and sanitize
        //call Google
        //print back out

    }

    private List readDataFromCSV(String file) throws FileNotFoundException {
        Scanner sc = new Scanner(new BufferedReader(new FileReader(file)));
        List<BookScore> scores = new ArrayList<>();
        String currentLine;
        String[] token;

        while (sc.hasNextLine()) {
            currentLine = sc.nextLine();
            token = currentLine.split(DELIMITER);

            BookScore score = new BookScore();
            try {
                score.setRank(Integer.parseInt(token[0]));
            } catch (Exception e) {
                System.out.println("Exception at rank at rank " + score.getRank());
            }

            //sanitize city
            try {
                score.setTemple(token[1].split("\\(")[0]);
            } catch (Exception e) {
                System.out.println("Exception at temple at rank " + score.getRank());
            }

            try {
                score.setZone(token[2]);
            } catch (Exception e) {
                System.out.println("Exception at zone at rank " + score.getRank());
            }

            //sanitize points
            try {
                String points = token[3];
                score.setTotalPoints(Double.parseDouble(points.split("\\(")[0]));
            } catch (Exception e) {
                System.out.println("Exception at points at rank " + score.getRank());
            }

            //score.setMonths(Integer.parseInt(points.split("\\(")[1].replace("\\(", "").replace("\\)", "")));
            try {
                score.setPercentChange(Double.parseDouble(token[4]));
            } catch (Exception e) {
                System.out.println("Exception at percent chanage at rank " + score.getRank());
            }
            try {
                score.setMahaBigBooks(Long.parseLong(token[5].replace("*", "")));
            } catch (Exception e) {
                System.out.println("Exception at maha big books at rank + " + score.getRank());
            }
            try {
                score.setBigBooks(Long.parseLong(token[6].replace("*", "")));
            } catch (Exception e) {
                System.out.println("Exception at big books at rank + " + score.getRank());
            }
            try {
                score.setMediumBooks(Long.parseLong(token[7].replace("*", "")));
            } catch (Exception e) {
                System.out.println("Exception at medium books at rank + " + score.getRank());
            }
            try {
                score.setSmallBooks(Long.parseLong(token[8].replace("*", "")));
            } catch (Exception e) {
                System.out.println("Exception at small books at rank + " + score.getRank());
            }
            try {
                score.setMags(Long.parseLong(token[9].replace("*", "")));
            } catch (Exception e) {
                System.out.println("Exception at mags at rank + " + score.getRank());
            }
            try {
                score.setBtgSubs(Long.parseLong(token[10].replace("*", "")));
            } catch (Exception e) {
                System.out.println("Exception at btg subs at rank + " + score.getRank());
            }
            try {
                score.setSets(Long.parseLong(token[11].replace("*", "")));
            } catch (Exception e) {
                System.out.println("Exception at sets at rank + " + score.getRank());
            }

            scores.add(score);

        }

        return scores;
    }

    private void printData(List<BookScore> scores) {
        for (BookScore s : scores) {
            System.out.println(s.toString());
        }
    }

    private void getAddresses(List<BookScore> scores) throws Exception {
        for (BookScore s : scores) {
            try {
                GeocoderRequest request = new GeocoderRequestBuilder().setAddress(s.getTemple()).setLanguage("en").getGeocoderRequest();
                GeocodeResponse response = geocoder.geocode(request);
                s.setResponse(response);
                s.setLatitude(response.getResults().get(0).getGeometry().getLocation().getLat().toString());
                System.out.println("Latitude " + s.getLatitude());
                s.setLongitude(response.getResults().get(0).getGeometry().getLocation().getLng().toString());
                System.out.println("Longitude " + s.getLongitude());
                System.out.println("Response status is " + response.getStatus().toString());
                System.out.println("Sleeping for 2 seconds");
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println("Exception during geocoding happened at score " + s.getTemple());
            }
        }
    }

    private void createCSV(List<BookScore> scores) throws Exception {
        PrintWriter out = new PrintWriter(new FileWriter("final_cities2010.txt"));
        for (BookScore s : scores) {
            out.println(s.getRank()+ DELIMITER
                        +s.getTemple() + DELIMITER
                        +s.getTotalPoints() + DELIMITER
                        +s.getPercentChange() + DELIMITER
                        +s.getMahaBigBooks() + DELIMITER
                        +s.getBigBooks() + DELIMITER
                        +s.getMediumBooks() + DELIMITER
                        +s.getSmallBooks() + DELIMITER
                        +s.getMags() + DELIMITER
                        +s.getBtgSubs() + DELIMITER
                        +s.getSets() + DELIMITER
                        +s.getLatitude() + DELIMITER
                        +s.getLongitude() + DELIMITER);
            out.flush();
        }
        out.close();
    }
}
