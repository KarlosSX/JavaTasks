package javaTasks1;

import java.util.Scanner;

public class JavaTask_06 {

    public static void main(String[] args) {

        /*
        BUNU HEM TERNARY HEM DE SWITCH ILE YAPMANI ISTIYORUM
HTTP is the protocol that governs communications between web-servers and web clients.
Part of the protocol includes a status code returned by the server to tell the browser the status of its most recent page request.
    Some of the status and their meanings are listed below:

            status status and their meanings:
                   200, OK
                   201, Created
                   202, Accepted
                   301, Moved Permanently
                   303, See Other
                   304, Not Modified
                   307, Temporary Redirect
                   400, Bad Request
                   401, Unauthorized
                   403, Forbidden
                   404, Not Found
                   410, Gone
                   500, Internal Server Error
                   503, Service Unavailable


         declare an int variable called statusCode, and a vlaid status code is already given
         write a program that prints out, on a line by itself, the appropriate label from the above list based on status.

                    Example:
                        if status code = 200

                    output:
                        ok

            NOTE: MUST USE TERNARY.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your status code: ");
        int stCode = scan.nextInt();

        String status = (stCode==200)? "OK" :(stCode==201)? "Created" :(stCode==202)? "Accepted" :(stCode==301)? "Moved Permanently" :(stCode==303)? "See Other" :(stCode==304)? "Not Modified"
                :(stCode==307)? "Temporary Redirect" :(stCode==400)? "Bad Request" :(stCode==401)? "Unauthorized" :(stCode==403)? "Forbidden" :(stCode==404)? "Not Found"
                :(stCode==410)? "Gone" :(stCode==500)? "Internal Server Error" : "Service Unavailable";

        System.out.println("status = " + status);

        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Enter your status code2: ");
        int stCode2 = scan.nextInt();

        String status2 = "";

        switch (stCode2){
            case 200:
                status2 = "OK";
                break;
            case 201:
                status2 = "Created";
                break;
            case 202:
                status2 = "Accepted";
                break;
            case 301:
                status2 = "Moved Permanently";
                break;
            case 303:
                status2 = "See Other";
                break;
            case 304:
                status2 = "Not Modified";
                break;
            case 307:
                status2 = "Temporary Redirect";
                break;
            case 400:
                status2 = "Bad Request";
                break;
            case 401:
                status2 = "Unauthorized";
                break;
            case 403:
                status2 = "Forbidden";
                break;
            case 404:
                status2 = "Not Found";
                break;
            case 410:
                status2 = "Gone";
                break;
            case 500:
                status2 = "Internal Server Error";
                break;
            default:
                status2 = "Service Unavailable";
        }

        System.out.println("status2 = " + status2);

        scan.close();
    }
}
