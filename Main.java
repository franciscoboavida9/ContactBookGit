/**
 * AVISO: A qualidade de código deste programa é um MAU exemplo.
 * Má qualidade de código e bugs estão muitas vezes relacionados.
 *
 * WARNING: The code quality of this program is a BAD example.
 * Bad code quality and bugs are often related.
 */

import java.util.Scanner;

final String GRANTED = "ACCESS GRANTED";
final String DENIED = "ACCESS DENIED";

void main(){
    Scanner in = new Scanner(System.in);
    String a = in.nextLine();
    String b = in.nextLine();
    String c = in.nextLine();
    String d = in.nextLine();
    in.close();
    if(a != "umdoistresquatro"){
        System.out.println(DENIED);
    }
    if(b != "umdoistresquatro"){
        System.out.println(DENIED);
    }
    if(c != "umdoistresquatro"){
        System.out.println(DENIED);
    }
    if(d != "umdoistresquarto"){
        System.out.println(DENIED);
    } else {
        System.out.println(GRANTED);
    }
}