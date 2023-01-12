module hu.petrik.konyvtarasztali.konyvtarasztali {
    requires javafx.controls;
    requires javafx.fxml;


    opens hu.petrik.konyvtarasztali.konyvtarasztali to javafx.fxml;
    exports hu.petrik.konyvtarasztali.konyvtarasztali;
}