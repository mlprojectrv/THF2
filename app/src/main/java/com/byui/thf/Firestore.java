package com.byui.thf;

import android.util.Log;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreSettings;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import static android.content.ContentValues.TAG;

public class Firestore {

    private final FirebaseFirestore db;
    private DatabaseReference mDatabase;
    private String Product;
    //private String Sales;
    //private String Price;
    private static DocumentReference mDocRef = FirebaseFirestore.getInstance().document("JsonUpdate/Q4PGpcjnBEAE6CiQSbD5");

   public Firestore(FirebaseFirestore db) {
        this.db = db;
    }

    public void setup() {
        FirebaseFirestore db = FirebaseFirestore.getInstance();

        FirebaseFirestoreSettings settings = new FirebaseFirestoreSettings.Builder()
                .setPersistenceEnabled(true)
                .build();
        db.setFirestoreSettings(settings);

    }


    public void StoreJson(List<JsonConvertible> Product) {

        Map<String, Object> Update = new HashMap<>();
        Update.put("Product", Product);
        // Update.put("Sales", Sales);
        // Update.put("Price", Price);

        db.collection("JsonUpdate").document("Q4PGpcjnBEAE6CiQSbD5")
                .set(Update)
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        Log.d(TAG, "DocumentSnapshot successfully written!");
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Log.w(TAG, "Error writing document", e);
                    }

        /*mDocRef.set(Update).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
                Log.d(TAG, "DocumentSnapshot written with ID");
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Log.w(TAG, "Json was not saved!", e);
            }
        });*/

                });
    }

}
