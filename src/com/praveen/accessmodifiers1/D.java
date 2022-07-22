package com.praveen.accessmodifiers1;

import java.security.ProtectionDomain;
import java.sql.SQLOutput;

public class D  {

  public String Message = "Public message";
  private String Privatemessge = "Private message";
          String Defaultmessage = "Default message";
  protected String Protectedmessage = "Protected Message";

    public static void main(String[] args) {

           D d = new D();
        System.out.println(d.Protectedmessage);
    }
}
