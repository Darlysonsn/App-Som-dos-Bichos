package somdosbichos.studio.dennis.com.somdosbichos;

import android.app.Activity;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity implements View.OnClickListener {

    private ImageView cao;
    private ImageView gato;
    private ImageView vaca;
    private ImageView macaco;
    private ImageView leao;
    private ImageView ovelha;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        cao = (ImageView) findViewById(R.id.caoId);
        gato = (ImageView) findViewById(R.id.gatoId);
        vaca = (ImageView) findViewById(R.id.vacaId);
        macaco = (ImageView) findViewById(R.id.macacoId);
        leao = (ImageView) findViewById(R.id.leaoId);
        ovelha = (ImageView) findViewById(R.id.ovelhaId);

        cao.setOnClickListener(this);
        gato.setOnClickListener(this);
        vaca.setOnClickListener(this);
        macaco.setOnClickListener(this);
        leao.setOnClickListener(this);
        ovelha.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId())
        {
            case R.id.caoId:
                mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.cao);
                tocar();
                break;
            case  R.id.gatoId:
                mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.gato);
                tocar();
                break;
            case R.id.macacoId:
                mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.macaco);
                tocar();
                break;
            case R.id.ovelhaId:
                mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.ovelha);
                tocar();
                break;
            case  R.id.vacaId:
                mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.vaca);
                tocar();
                break;
            case R.id.leaoId:
                mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.leao);
                tocar();
                break;
        }

    }

    public void tocar()
    {
        if(mediaPlayer != null)
        {
            mediaPlayer.start();
        }
    }

    @Override
    protected void onDestroy() {
        if(mediaPlayer != null && mediaPlayer.isPlaying())
        {
            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer = null;
        }
        super.onDestroy();
    }
}
