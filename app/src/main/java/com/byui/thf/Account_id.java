package com.byui.thf;

public class Account_id {
    public String hash;
    public String salt;
    public String password;

    public Account_id(String startPassword) {
        password = startPassword;
    }

    public String getPassword() {
        return password;

    }

    public void setPassword(String newPassword) {
        password = newPassword;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String newSalt) {
        salt = newSalt;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String newHash) {
        hash = newHash;
    }

}




