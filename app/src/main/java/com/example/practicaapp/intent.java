package com.example.practicaapp;

public class intent {
    public class MainActivity extends AppCompatActivity {
        // ...

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            // ...

            // Asignar el OnClickListener al botón para abrir el sitio web
            Button buttonOpenWebsite = findViewById(R.id.buttonOpenWebsite);
            buttonOpenWebsite.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openWebsite();
                }
            });
        }

        public void openWebsite() {
            String url = "https://www.example.com";


            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));

            if (intent.resolveActivity(getPackageManager()) != null) {
                // Iniciar el intent
                startActivity(intent);
            } else {
                Toast.makeText(this, "No hay aplicaciones disponibles para abrir el enlace", Toast.LENGTH_SHORT).show();
            }
        }

        // ...
    }

}
