package br.com.devmedia.gestaoacademica;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import br.com.devmedia.gestaoacademica.db.Persistencia;
import br.com.devmedia.gestaoacademica.model.Docente;

public class MainActivity extends Activity implements View.OnClickListener{

    private Docente docente = new Docente();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button salvar = (Button) findViewById(R.id.salvar);
        salvar.setOnClickListener(this);

       
    }

    @Override
    public void onClick(View v) {
        final Context context = this;

        EditText nome = (EditText) findViewById(R.id.nome);
        EditText matricula = (EditText) findViewById(R.id.matricula);
        EditText titulacao = (EditText) findViewById(R.id.titulacao);

        docente.setNome(nome.getText().toString());
        docente.setMatricula(matricula.getText().toString());
        docente.setTitulacao(titulacao.getText().toString());

        //Fazendo o INSERT no BD
        Persistencia bd = new Persistencia(this, "ga", 1);

        ContentValues contentValues = new ContentValues();
        contentValues.put("nome", docente.getNome());
        contentValues.put("matricula", docente.getMatricula());
        contentValues.put("titulacao", docente.getTitulacao());

        bd.getWritableDatabase().insert("TB_DOCENTES", null, contentValues);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


}
