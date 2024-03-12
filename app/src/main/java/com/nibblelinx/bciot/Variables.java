package com.nibblelinx.bciot;

public class Variables {

    static String LastRawDecriptData = "";
    static Boolean Payment = false;
    static String MainPaymail = "";
    static Boolean MyNFTs = false;
    static int TotalList = 0;

    static String SatBalance = "";

    static String LastTxHexData = "";
    static String Arduino = "";
    static Boolean CompPKey = false;
    static int PoolID = 0;

    static int TokenType = 0;

    static String ArduinoBSVAdd = "";
    static String ArduinoLastTX = "ABC";
    static String[] txIDVector = new String[1000];

    static String resultArduino = "";

    static String txBitaisl = "";



    static int ntries = 0;

    //static long BSVDustLimitLong = 135;
    static long BSVDustLimitLong = 1;
    static int progressBar = 0;
    static String BSVWallet = "";
    static String LastTXID = "";

    static Boolean activityPause = false;

    static int MAXPAUSETIME = 60;//60;
    static int MAXSPECIALPAUSETIME = 30;//30;
    static int timeCounter = MAXPAUSETIME;

    static int MAXNOINTERACTIONTIME = 30;//30;
    static int userInteractionAct = MAXNOINTERACTIONTIME;

    static int BarSize = 0;
    static Boolean BarType = false;
}
