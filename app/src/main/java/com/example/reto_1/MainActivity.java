package com.example.reto_1;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.widget.Button;
import com.example.reto_1.ui.home.HomeFragment;
import com.google.android.material.snackbar.Snackbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.appcompat.app.AppCompatActivity;

import com.example.reto_1.databinding.ActivityMainBinding;

// Clase principal
/* Clase principal */
/** Clase principal **/
public class MainActivity extends AppCompatActivity {

    //Declaracion fragments
    /* Declaracion fragments */
    /** Declaracion fragments **/
    Fragment menuHamb;

    //Declaracion fragments
    /* Declaracion fragments */
    /** Declaracion fragments **/
    Fragment menuPizza;

    //Declaracion fragments
    /* Declaracion fragments */
    /** Declaracion fragments **/
    Fragment menuHotdog;

    //Declaracion fragments
    /* Declaracion fragments */
    /** Declaracion fragments **/
    Fragment menuEmpanada;

    //Declaracion fragments
    /* Declaracion fragments */
    /** Declaracion fragments **/
    Fragment ingresoUsuario;

    //Declaracion fragments
    /* Declaracion fragments */
    /** Declaracion fragments **/
    Fragment buscar;

    //Declaracion fragments
    /* Declaracion fragments */
    /** Declaracion fragments **/
    Fragment favorito;

    //Declaracion fragments
    /* Declaracion fragments */
    /** Declaracion fragments **/
    Fragment mainMenu;

    //Declaracion fragments
    /* Declaracion fragments */
    /** Declaracion fragments **/
    Fragment servicios;

    //Declaracion fragments
    /* Declaracion fragments */
    /** Declaracion fragments **/
    Fragment sucursales;

    //Declaracion fragments
    /* Declaracion fragments */
    /** Declaracion fragments **/
    Fragment perfil;

    //Declaracion transaccion
    /* Declaracion transaccion */
    /** Declaracion transaccion **/
    FragmentTransaction intercambio;

    //Declaracion botones
    /* Declaracion botones */
    /** Declaracion botones **/
    Button botonComp;

    //Declaracion botones
    /* Declaracion botones */
    /** Declaracion botones **/
    Button botonComp2;

    //Declaracion botones
    /* Declaracion botones */
    /** Declaracion botones **/
    Button botonComp3;

    //Declaracion botones
    /* Declaracion botones */
    /** Declaracion botones **/
    Button botonComp4;

    //Declaracion botones
    /* Declaracion botones */
    /** Declaracion botones **/
    Button backHamb;

    //Declaracion botones
    /* Declaracion botones */
    /** Declaracion botones **/
    Button backEmp;

    //Declaracion botones
    /* Declaracion botones */
    /** Declaracion botones **/
    Button backHot;

    //Declaracion botones
    /* Declaracion botones */
    /** Declaracion botones **/
    Button backPi;

    //Declaracion botones
    /* Declaracion botones */
    /** Declaracion botones **/
    Button ingresar;


    //App bar configuration
    /* App bar configuration */
    /** App bar configuration **/
    private AppBarConfiguration mAppBarConfig;

    //Binding configuration
    /* Binding configuration */
    /** Binding configuration **/
    private ActivityMainBinding binding;

    @Override
    /* Create class */
    protected void onCreate(Bundle savedInstSt) {
        super.onCreate(savedInstSt);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //Asignacion fragments
        /* Asignacion fragments */
        /** Asignacion fragments **/
        ingresoUsuario = new Ingreso_usuario();
        buscar = new Buscar();
        favorito = new Favoritos();
        servicios = new Servicios();
        sucursales = new Sucursales();

        //Fragment hamburguesa
        /* Fragment hamburguesa */
        /** Fragment hamburguesa **/
        mainMenu = new Main_menu();
        menuHamb = new Menu_hamburguesa();
        botonComp = (Button) findViewById(R.id.compHamb);
        botonComp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View vista) {
                getSupportFragmentManager().beginTransaction().replace(R.id.menu, menuHamb).commit();


            }
        });

        //Fragment pizza
        /* Fragment pizza */
        /** Fragment pizza **/
        menuPizza = new Menu_pizza();
        botonComp2 = (Button) findViewById(R.id.compPizza);
        botonComp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View vista) {
                getSupportFragmentManager().beginTransaction().replace(R.id.menu, menuPizza).setReorderingAllowed(true).commit();
            }
        });

        //Fragment hotdog
        /* Fragment hotdog */
        /** Fragment hotdog **/
        menuHotdog = new Menu_hotdog();
        botonComp3 = (Button) findViewById(R.id.compHotdog);
        botonComp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View vista) {
                getSupportFragmentManager().beginTransaction().replace(R.id.menu, menuHotdog).commit();
            }
        });

        //Fragment empanada
        /* Fragment empanada */
        /** Fragment empanada **/
        menuEmpanada = new Menu_empanada();
        botonComp4 = (Button) findViewById(R.id.compEmpanada);
        botonComp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View vista) {
                getSupportFragmentManager().beginTransaction().replace(R.id.menu, menuEmpanada).commit();
            }
        });

        //Volver hamburguesa
        /* Volver hamburguesa */
        /** Volver hamburguesa **/
        mainMenu = new HomeFragment();
        backHamb = (Button) findViewById(R.id.volverHamb);
        backHamb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View vista) {
                intercambio = getSupportFragmentManager().beginTransaction();
                intercambio.replace(R.id.hamb, mainMenu).commit();
            }
        });

        //Volver empanada
        /* Volver empanada */
        /** Volver empanada **/
        backEmp = (Button) findViewById(R.id.volverEmp);
        backEmp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View vista) {
                intercambio = getSupportFragmentManager().beginTransaction();
                intercambio.replace(R.id.emp, mainMenu).commit();
            }
        });

        //Volver pizza
        /* Volver pizza */
        /** Volver pizza **/
        backPi = (Button) findViewById(R.id.volverPizza);
        backPi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View vista) {
                intercambio = getSupportFragmentManager().beginTransaction();
                intercambio.replace(R.id.Pizza, mainMenu).commit();
            }
        });

        //Volver hotdog
        /* Volver hotdog */
        /** Volver hotdog **/
        backHot = (Button) findViewById(R.id.volverHot);
        backHot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View vista) {
                intercambio = getSupportFragmentManager().beginTransaction();
                intercambio.replace(R.id.Hot, mainMenu).commit();
            }
        });

        //toolbar
        /* toolbar */
        /** toolbar **/
        setSupportActionBar(binding.appBarMain.toolbar);
        binding.appBarMain.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    // Menu
    /* Menu */
    /** Menu **/
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    // Navegacion
    /* Navegacion */
    /** Navegacion **/
    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, mAppBarConfig)
                || super.onSupportNavigateUp();
    }

    // Controlador items
    /* Controlador items */
    /** Controlador items **/
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.usuario:
                getSupportFragmentManager().beginTransaction().replace(R.id.menu, ingresoUsuario).commit();
                return true;
            case R.id.buscar:
                getSupportFragmentManager().beginTransaction().replace(R.id.menu, buscar).commit();
                return true;
            case R.id.favorito:
                getSupportFragmentManager().beginTransaction().replace(R.id.menu, favorito).commit();
                return true;
            case R.id.productos:
                getSupportFragmentManager().beginTransaction().replace(R.id.menu, mainMenu).commit();
                return true;
            case R.id.servicios:
                getSupportFragmentManager().beginTransaction().replace(R.id.menu, servicios).commit();
                return true;
            case R.id.sucursales:
                getSupportFragmentManager().beginTransaction().replace(R.id.menu, sucursales).commit();
                return true;
            default:
                return true;
        }
    }

}