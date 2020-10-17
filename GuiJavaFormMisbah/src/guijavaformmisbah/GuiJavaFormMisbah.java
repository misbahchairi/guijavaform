/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guijavaformmisbah;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Misbah
 */
public class GuiJavaFormMisbah extends Application {
    Stage window;
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("Form Misbah");
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(10);
        grid.setHgap(10);
        grid.setPadding(new Insets(10));
        
        Label lblNama = new Label("Nama :");
        grid.add(lblNama,0,0);
        
        TextField txtNama = new TextField();
        txtNama.setPromptText("Masukkan Nama");
        grid.add(txtNama,1,0);
        
        Label lblTelepon = new Label("Telepon :");
        grid.add(lblTelepon,0,1);
        
        TextField txtTelepon = new TextField();
        txtTelepon.setPromptText("Masukkan Telepon");
        grid.add(txtTelepon,1,1);
        
        Label lblAlamat = new Label("Alamat :");
        grid.setValignment(lblAlamat, VPos.TOP);
        grid.add(lblAlamat,0,2);
        
        TextArea txtAlamat = new TextArea();
        txtAlamat.setPrefSize(20, 100);
        txtAlamat.setPromptText("Masukkan Alamat");
        grid.add(txtAlamat,1,2);
        
        Button loginBtn = new Button("Kirim");
        grid.add(loginBtn,0,3);
        Button hapusBtn = new Button("Hapus");
        grid.add(hapusBtn,1,3);
            
        Scene scene = new Scene(grid,300,300);
        window.setScene(scene);
        window.show();
    }

    /**
     * @param args the command line arguments
     */
    
    
}
