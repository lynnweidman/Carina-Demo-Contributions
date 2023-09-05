package com.zebrunner.carina.demo;

import com.zebrunner.carina.core.IAbstractTest;

public class EncryptionPractice implements IAbstractTest {

    //Encryption Practice
    //@Test
   /* public void testEncryption() throws IOException {
        String pw = "Password*555";
        byte[] encryptPassword = Base64.getEncoder().encode(pw.getBytes());
        System.out.println("Encrypted PW: " + new String(encryptPassword));

        byte[] decodedPassword = Base64.getDecoder().decode(encryptPassword);
        System.out.println("Decrypted PW: " + new String(decodedPassword));*/

/*
        Properties properties = new Properties();
        properties.load(new FileInputStream("C:\\Users\\lcwtr\\IdeaProjects\\carina-demo\\src\\test\\resources\\Login.properties"));
        String encryptedPassword = properties.getProperty("encryptedPassword");
        System.out.println("Encrypted password:  " + encryptedPassword);

        byte[] decodePassword = Base64.getDecoder().decode(encryptedPassword);
        System.out.println("Decrypted PW from properties: " + new String(decodePassword));*/

       /* Properties properties = new Properties();
        properties.load(new FileInputStream("C:\\Users\\lcwtr\\IdeaProjects\\carina-demo\\src\\test\\resources\\Login.properties"));
        String encryptedPassword = properties.getProperty("encryptedPassword");
        System.out.println("Encryped pw ======" + encryptedPassword);
        byte[] decryptedPassword = Base64.getDecoder().decode(encryptedPassword);
        String pw = Arrays.toString(decryptedPassword);
        System.out.println("Decryped pa ====  " + pw);*/
}
