package programs;
/*
 * The Calendar class is an abstract class that provides methods for converting between a specific instant in time and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the calendar fields, such as getting the date of the next week.

You are given a date. You just need to write the method, getDay, which returns the day on that date. To simplify your task, we have provided a portion of the code in the editor.

Example

month = 8
day = 14
year = 2017

The method should return MONDAY as the day on that date.

Function Description

Complete the findDay function in the editor below.

findDay has the following parameters:

int: month
int: day
int: year

Returns

string: the day of the week in capital letters

Input Format

A single line of input containing the space separated month, day and year, respectively, in MM DD YYYY format.

Constraints

2000 < YEAR < 3000

Sample Input

08 05 2015

Sample Output

WEDNESDAY

Explanation

The day on August 5th 2015 was WEDNESDAY.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class FindDay {
    public static String getDay(int day, int month, int year){
        LocalDate lDate = LocalDate.of(day, month, year);        
        return lDate.getDayOfWeek().toString();
    }

    // with Localdate, the calendar takes the format YYYY DD MM ie 2000 20 12
    public static void main(String[] args){
        
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));) {
            String[] multipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
            int day = Integer.parseInt(multipleInput[0]);
            int month = Integer.parseInt(multipleInput[1]);
            int year = Integer.parseInt(multipleInput[2]);           
            String res = FindDay.getDay(day, month, year);
            System.out.println(res);

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e);
        }
    }
}
