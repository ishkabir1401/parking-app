package com.dominicsilveira.parkingsystem.classes;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class NumberPlate {
    public String numberPlate,userID,userID_isDeletedQuery;
    public int wheelerType,isDeleted;

    public NumberPlate(){}

    public NumberPlate(String numberPlate, int wheelerType, int isDeleted, String userID,String userID_isDeletedQuery){

        this.numberPlate=numberPlate;
        this.wheelerType=wheelerType;
        this.isDeleted=isDeleted;
        this.userID=userID;
        this.userID_isDeletedQuery=userID_isDeletedQuery;
    }
}
