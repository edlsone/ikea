/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.com.itexps;

/**
 *
 * @author edls3
 */
public class SignUpPojo {
    
    private String firstName;
    private String lastName;
    private String birthDate;
    private String address;
    private String address1;
    private String cityName;
    private String zipCode;
    private String email;
    private String password;
    private int otpInput0;
    private int otpInput1;
    private int otpInput2;
    private int otpInput3;
    private int otpInput4;
    private int otpInput5;

    public SignUpPojo(String firstName, String lastName, String birthDate, String address, String address1, String cityName, String zipCode, String email, String password, int otpInput0, int otpInput1, int otpInput2, int otpInput3, int otpInput4, int otpInput5) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.address = address;
        this.address1 = address1;
        this.cityName = cityName;
        this.zipCode = zipCode;
        this.email = email;
        this.password = password;
        this.otpInput0 = otpInput0;
        this.otpInput1 = otpInput1;
        this.otpInput2 = otpInput2;
        this.otpInput3 = otpInput3;
        this.otpInput4 = otpInput4;
        this.otpInput5 = otpInput5;
    }

    
    
    @Override
    public String toString() {
        return "SignUp{" + "firstName=" + firstName + ", lastName=" + lastName + ", birthDate=" + birthDate + ", address=" + address + ", address1=" + address1 + ", cityName=" + cityName + ", zipCode=" + zipCode + ", email=" + email + ", password=" + password + ", otpInput0=" + otpInput0 + ", otpInput1=" + otpInput1 + ", otpInput2=" + otpInput2 + ", otpInput3=" + otpInput3 + ", otpInput4=" + otpInput4 + ", otpInput5=" + otpInput5 + '}';
    }

    
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getOtpInput0() {
        return otpInput0;
    }

    public void setOtpInput0(int otpInput0) {
        this.otpInput0 = otpInput0;
    }

    public int getOtpInput1() {
        return otpInput1;
    }

    public void setOtpInput1(int otpInput1) {
        this.otpInput1 = otpInput1;
    }

    public int getOtpInput2() {
        return otpInput2;
    }

    public void setOtpInput2(int otpInput2) {
        this.otpInput2 = otpInput2;
    }

    public int getOtpInput3() {
        return otpInput3;
    }

    public void setOtpInput3(int otpInput3) {
        this.otpInput3 = otpInput3;
    }

    public int getOtpInput4() {
        return otpInput4;
    }

    public void setOtpInput4(int otpInput4) {
        this.otpInput4 = otpInput4;
    }

    public int getOtpInput5() {
        return otpInput5;
    }

    public void setOtpInput5(int otpInput5) {
        this.otpInput5 = otpInput5;
    }

    
}
