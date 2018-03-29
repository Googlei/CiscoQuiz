package com.ryuga.ciscoquiz;

public class Soal {
    public String pertanyaan[] = {
            "A network administrator needs to keep the user ID, password, and session contents private " +
                    "when establishing remote CLI connectivity with a switch to manage it. Which access " +
                    "method should be chosen?","Which procedure is used to access a Cisco 2960 switch when " +
            "performing an initial configuration in a secure environment?" , "A router has a valid operating s" +
            "ystem and a configuration stored in NVRAM. When the router boots up, which mode will display?",
            "What is a result of using the service password-encryption command on a Cisco network device?",
            "A new network administrator has been asked to enter a banner message on a Cisco device. What is the fastest way a network administrator could test whether the banner is properly configured?"
    };

    private String pilihanJawaban[][] = {
            {"Telnet","Console","SSH"},
            {"Use Telnet to remotely access the switch through the network.","Use the console port to locally access the switch from a serial or USB interface of the PC.","Use Secure Shell to remotely access the switch through the network."},
            {"global configuration mode","setup mode","user EXEC mode"},
            {"The command encrypts the banner message.","All passwords in the configuration are not shown in clear text when viewing the configuration.","The command encrypts the enable mode password."},
            {"Exit privileged EXEC mode and press Enter.","Reboot the device.","Power cycle the device."}

    };

    private String jawabanBenar[] = {
            "SSH",
            "Use the console port to locally access the switch from a serial or USB interface of the PC.",
            "user EXEC mode",
            "All passwords in the configuration are not shown in clear text when viewing the configuration.",
            "Exit privileged EXEC mode and press Enter."
    };

    //membuat getter untuk mengambil pertanyaan
    public String getPertanyaan(int x){
        String soal = pertanyaan[x];
        return soal;
    }

    //membuat getter untuk mengambil pilihan jawaban 1
    public String getPilihanJawaban1(int x){
        String jawaban1 = pilihanJawaban[x][0];
        return jawaban1;
    }

    //membuat getter untuk mengambil pilihan jawaban 2
    public String getPilihanJawaban2(int x){
        String jawaban2 = pilihanJawaban[x][1];
        return jawaban2;
    }

    //membuat getter untuk mengambil pilihan jawaban 3
    public String getPilihanJawaban3(int x){
        String jawaban3 = pilihanJawaban[x][2];
        return jawaban3;
    }

    //membuat getter untuk mengambil jawaban benar
    public String getJawabanBenar(int x){
        String jawaban = jawabanBenar[x];
        return jawaban;
    }
}
