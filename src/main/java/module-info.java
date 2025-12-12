module projectgroup1.group1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires com.almasb.fxgl.all;

    opens projectgroup1.group1 to javafx.fxml;
    exports projectgroup1.group1;
}