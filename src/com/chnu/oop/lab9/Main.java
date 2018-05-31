package com.chnu.oop.lab9;

import java.io.File;

public class Main {

    public static void main(String[]args){

            File file = new File(System.getProperty("user.dir"),"TextFile\\text.txt");
            FileOp fileOperation=new FileOp();
            fileOperation.copyFile(file);

        }

    }

