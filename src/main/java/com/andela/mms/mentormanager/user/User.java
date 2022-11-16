package com.andela.mms.mentormanager.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Timosamedet
 * @since Nov 16, 2022 12:17:13 PM
 */
@Entity
@Table(name = "user")
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    private String userName;
    private String email;
    private String status;
    private int techStackId;
    private String password;

    public User()
    {

    }

    public int getUserId()
    {
        return userId;
    }

    public void setUserId(int userId)
    {
        this.userId = userId;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public int getTechStackId()
    {
        return techStackId;
    }

    @Override
    public String toString()
    {
        return "User{" + "userName=" + userName + ", email=" + email + ", status=" + status + ", techStackId=" + techStackId + '}';
    }

    public void setTechStackId(int techStackId)
    {
        this.techStackId = techStackId;
    }

}
