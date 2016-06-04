package com.company;

import java.io.IOException;

/**
 * Created by Zeeshan on 6/4/2016.
 */
public class tryagain {
    char again;

    public boolean wantme() throws IOException {
        boolean againBool = false;
        System.out.print("Do you want to try again? \n Press <N> for no OR any key to continue......   ");
        again = (char) System.in.read();
        System.in.read();
        if(again == 'N' || again == 'n')
        {
            againBool = true;
        }
        return againBool;

    }
}
