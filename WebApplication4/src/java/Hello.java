/**
 * Copyright (c) 2014 Oracle and/or its affiliates. All rights reserved.
 *
 * You may not modify, use, reproduce, or distribute this software except in
 * compliance with  the terms of the License at:
 * http://java.net/projects/javaeetutorial/pages/BerkeleyLicense
 */

import java.util.*;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.faces.bean.ManagedProperty;

@Model
public class Hello {
private String preferredContact;
    private String name;
    private boolean job;
    private String gender;
    
    
    
    
    public Hello() {
    }

    public String getName() {
        return name;
    }

    public void setName(String user_name) {
        this.name = user_name;
    }
  
    public boolean isJob() {
        return job;
    }

   public void setJob(boolean job) {
        this.job = job;
    }
    public void setGender(String gender){
    this.gender=gender;
    }


    public String getGender() {
        return gender;
    }



public void setPreferredContact(String preferredContact) {
    this.preferredContact = preferredContact;
}

public String getPreferredContact() {
    return preferredContact;
}


}

