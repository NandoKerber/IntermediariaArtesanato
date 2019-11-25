package com.example.appprodutodrawer.DBHelper;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.appprodutodrawer.Produto.Produtos;

import java.util.ArrayList;

public class DBHelper extends SQLiteOpenHelper {

    private static final String DBPRODUTO = "DBPRODUTO";
    private static final int VERSION = 1;

    public DBHelper(@Nullable Context context) {
        super(context, DBPRODUTO, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
String sql = "CREATE TABLE produtos(id INTEGER PRIMARY KEY AUTOINCREMENT , nomeproduto TEXT NOT NULL, descricao TEXT NOT NULL, preco INTEGER NOT NULL)";
   db.execSQL(sql);
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
String sql = "DROP TABLE IF EXISTS produtos";
db.execSQL(sql);
    }
    public void salvarDados(Produtos produto) {
        ContentValues valores = new ContentValues();
        valores.put("nomeproduto", produto.getNomeProduto());
        valores.put("descricao", produto.getDescricao());
        valores.put("preco", produto.getPreco());
getWritableDatabase().insert("produtos", null, valores);
    }//fim do método salvarProdutos

    public ArrayList<Produtos> mostrarProdutos(){
        String [] colunas = {"id","nomeproduto","descricao","preco"};
        ArrayList<Produtos> listaProdutos = new ArrayList<Produtos>();
        Cursor ponteiro = getWritableDatabase().query("Produtos",colunas,null,null,null,null,null
        );
        while (ponteiro.moveToNext()){
            Produtos produto = new Produtos();
            produto.setId(ponteiro.getLong(0));
            produto.setNomeProduto(ponteiro.getString(1));
            produto.setDescricao(ponteiro.getString(2));
            produto.setPreco(ponteiro.getInt(3));
            listaProdutos.add(produto);
        }//fim do while

        return listaProdutos;
    }//fim do metodo mostraProduto

}//fim da classe DBHelper
