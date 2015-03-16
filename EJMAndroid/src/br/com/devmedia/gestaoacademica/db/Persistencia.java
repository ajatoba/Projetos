package br.com.devmedia.gestaoacademica.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Persistencia extends SQLiteOpenHelper{

    public Persistencia(Context context, String name, int version) {
        super(context, name, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqld) {
        sqld.execSQL("CREATE TABLE TB_DOCENTES (" +
                "id_docentes INTEGER PRIMARY KEY autoincrement,"
                + " nome varchar(50) NOT NULL ,"
                + " matricula varchar(11) NOT NULL,"
                + " titulacao varchar(50) NOT NULL" + ");");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqld, int i, int i1) {

    }
    
}