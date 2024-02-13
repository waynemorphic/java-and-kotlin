package programs.java;

/*
A teacher asks the class to open their books to a page number. A student can either start turning pages from the 
front of the book or from the back of the book. They always turn pages one at a time. When they open the book, page 1
is always on the right side:

When they flip page 1, they see pages 2 and 3. Each page except the last page will always be printed on both sides. 
The last page may only be printed on the front, given the length of the book. If the book is n pages long, and a student wants to turn to page p
, what is the minimum number of pages to turn? They can start at the beginning or the end of the book.

Given n and p, find and print the minimum number of pages that must be turned in order to arrive at page p.

Example
n = 5
p = 3

Function Description

Complete the pageCount function in the editor below.

pageCount has the following parameter(s):

    int n: the number of pages in the book
    int p: the page number to turn to

Returns

    int: the minimum number of pages to turn

Input Format

The first line contains an integer n, the number of pages in the book.
The second line contains an integer, p,the page to turn to.
 */

public class PageFlip {
    public static int pageCount(int n, int p){
        int flip = 0;

        // p is zero or one or n is zero
        if (p == 0 || p == 1 || n == 0){
            return flip;
        }

        // min number from beginning and from end to the target page
        flip = Math.min(pageFlip(p) - 1, pageFlip(n) - pageFlip(p));

        return flip;
    }

    public static int pageFlip(int x){
        return (x / 2 + 1);
    }

    public static void main(String[] arg){
        int n = 6;
        int p = 2;

        System.out.println(PageFlip.pageCount(n, p));
    }
    
}
