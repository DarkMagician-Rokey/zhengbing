package Dao;

/**
 * Created by ttc on 17-12-27.
 */
public class User
{
    private String UserPhoneNumber;
    private String UserPassword;
    private String UserName;
    private String UserSex;
    private String UserTypeOfCertificate;
    private String UserLicenseNumber;
    private String UserMailbox;
    private String UserSecurityQuestion1;
    private String UserAnswer1;
    private String UserSecurityQuestion2;
    private String UserAnswer2;
    private String UserSecurityQuestion3;
    private String UserAnswer3;
    private String UserPhotoUrl;


    public User()
    {
    }

    public User(String userPhoneNumber, String userPassword, String userName, String userSex, String userTypeOfCertificate, String userLicenseNumber, String userMailbox, String userSecurityQuestion1, String userAnswer1, String userSecurityQuestion2, String userAnswer2, String userSecurityQuestion3, String userAnswer3, String userPhotoUrl)
    {
        UserPhoneNumber = userPhoneNumber;
        UserPassword = userPassword;
        UserName = userName;
        UserSex = userSex;
        UserTypeOfCertificate = userTypeOfCertificate;
        UserLicenseNumber = userLicenseNumber;
        UserMailbox = userMailbox;
        UserSecurityQuestion1 = userSecurityQuestion1;
        UserAnswer1 = userAnswer1;
        UserSecurityQuestion2 = userSecurityQuestion2;
        UserAnswer2 = userAnswer2;
        UserSecurityQuestion3 = userSecurityQuestion3;
        UserAnswer3 = userAnswer3;
        UserPhotoUrl = userPhotoUrl;
    }

    public String getUserPhoneNumber()
    {
        return UserPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber)
    {
        UserPhoneNumber = userPhoneNumber;
    }

    public String getUserPassword()
    {
        return UserPassword;
    }

    public void setUserPassword(String userPassword)
    {
        UserPassword = userPassword;
    }

    public String getUserName()
    {
        return UserName;
    }

    public void setUserName(String userName)
    {
        UserName = userName;
    }

    public String getUserSex()
    {
        return UserSex;
    }

    public void setUserSex(String userSex)
    {
        UserSex = userSex;
    }

    public String getUserTypeOfCertificate()
    {
        return UserTypeOfCertificate;
    }

    public void setUserTypeOfCertificate(String userTypeOfCertificate)
    {
        UserTypeOfCertificate = userTypeOfCertificate;
    }

    public String getUserLicenseNumber()
    {
        return UserLicenseNumber;
    }

    public void setUserLicenseNumber(String userLicenseNumber)
    {
        UserLicenseNumber = userLicenseNumber;
    }

    public String getUserMailbox()
    {
        return UserMailbox;
    }

    public void setUserMailbox(String userMailbox)
    {
        UserMailbox = userMailbox;
    }

    public String getUserSecurityQuestion1()
    {
        return UserSecurityQuestion1;
    }

    public void setUserSecurityQuestion1(String userSecurityQuestion1)
    {
        UserSecurityQuestion1 = userSecurityQuestion1;
    }

    public String getUserAnswer1()
    {
        return UserAnswer1;
    }

    public void setUserAnswer1(String userAnswer1)
    {
        UserAnswer1 = userAnswer1;
    }

    public String getUserSecurityQuestion2()
    {
        return UserSecurityQuestion2;
    }

    public void setUserSecurityQuestion2(String userSecurityQuestion2)
    {
        UserSecurityQuestion2 = userSecurityQuestion2;
    }

    public String getUserAnswer2()
    {
        return UserAnswer2;
    }

    public void setUserAnswer2(String userAnswer2)
    {
        UserAnswer2 = userAnswer2;
    }

    public String getUserSecurityQuestion3()
    {
        return UserSecurityQuestion3;
    }

    public void setUserSecurityQuestion3(String userSecurityQuestion3)
    {
        UserSecurityQuestion3 = userSecurityQuestion3;
    }

    public String getUserAnswer3()
    {
        return UserAnswer3;
    }

    public void setUserAnswer3(String userAnswer3)
    {
        UserAnswer3 = userAnswer3;
    }

    public String getUserPhotoUrl()
    {
        return UserPhotoUrl;
    }

    public void setUserPhotoUrl(String userPhotoUrl)
    {
        UserPhotoUrl = userPhotoUrl;
    }
}
