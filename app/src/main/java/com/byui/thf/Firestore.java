package com.byui.thf;

import android.util.Log;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
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

    //private final FirebaseFirestore db;
   // private DatabaseReference mDatabase;
    private String Product;
    private String Sales;
    private String Price;
    private static DocumentReference mDocRef = FirebaseFirestore.getInstance().document("JsonUpdate/Q4PGpcjnBEAE6CiQSbD5");

   /*  public Firestore(FirebaseFirestore db) {
        this.db = db;
    }

    public void setup() {
        FirebaseFirestore db = FirebaseFirestore.getInstance();

        FirebaseFirestoreSettings settings = new FirebaseFirestoreSettings.Builder()
                .setPersistenceEnabled(true)
                .build();
        db.setFirestoreSettings(settings);

    } */


    public void priceFunc() {
        Calendar c1 = Calendar.getInstance();
        c1.set(1994, 8, 12);
        Price p1 = new Price();
        p1.setStart_date(c1.getTime());
        p1.setEnd_date(null);
        p1.setAmount(10);

        Price p2 = new Price();
        c1.set(1994, 8, 13);
        p2.setStart_date(c1.getTime());
        p2.setEnd_date(null);
        p2.setAmount(50);

        Price p3 = new Price();
        c1.set(1994, 8, 13);
        p3.setStart_date(c1.getTime());
        p3.setEnd_date(null);
        p3.setAmount(50);

        //woo's made dis function
        Product pr1 = new Product();

        pr1.setQuanitity(1);
        pr1.setColor1("yellow");
        pr1.setColor2("green");
        pr1.setPattern("stripe");
        pr1.setSeries("idunno");
        pr1.setType("idunno");

        Product pr2 = new Product();
        pr2.setQuanitity(1);
        pr2.setColor1("white");
        pr2.setColor2("brown");
        pr2.setPattern("fill");
        pr2.setSeries("idunno");
        pr2.setType("idunno");

        Product pr3 = new Product();
        pr3.setQuanitity(1);
        pr3.setColor1("purple");
        pr3.setColor2("blue");
        pr3.setPattern("Floral");
        pr3.setSeries("idunno");
        pr3.setType("idunno");
        //woo finishes the function above



        Type listType = new TypeToken<List<JsonConvertible>>() {}.getType();
        List<JsonConvertible> target = new LinkedList<>();
        target.add(p1);
        target.add(p2);
        target.add(p3);

        //woo edits
        target.add(pr1);
        target.add(pr2);
        target.add(pr3);
        //finished




        for (JsonConvertible i : target) {
            i.setId(IdGenerator.generateID());
        }

        /// serializing : Json -> String
        /// Deserializing  : String -> Json

        Gson gson = new Gson();

        /// Converts String(Linked list) to Json
        /// put together part
        String json = gson.toJson(target, listType);

        /// Json to Linked list
        /// break it up
        List<JsonConvertible> target2 = gson.fromJson(json, listType);

        System.out.print(json);

        /// write Json

        StoreJson(target2);

        /// Read Json file
        List<JsonConvertible> target1  = readJson("price", listType);
    }

    public static void StoreJson(List<JsonConvertible> Product){

        Map<String, Object> Update = new HashMap<>();
        Update.put("Product", Product);
       // Update.put("Sales", Sales);
        // Update.put("Price", Price);

        mDocRef.set(Update).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
                Log.d(TAG, "DocumentSnapshot written with ID");
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Log.w(TAG, "Json was not saved!", e);
            }
        });

    }

    public List<JsonConvertible> readJson(String filename, Type type) {
        Gson gson = new Gson();
        List<JsonConvertible> file;
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))){
            file = gson.fromJson(bufferedReader, type);
        } catch (FileNotFoundException cause){
            System.out.println("File Not found.");
            return null;
        } catch (IOException cause){
            System.out.println("Io error.");
            return null;
        }
        return file;
    }


}
