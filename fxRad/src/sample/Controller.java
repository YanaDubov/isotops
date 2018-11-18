package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Iterator;

import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

public class Controller {
    @FXML
    public ListView<Isotop> listView1;
    @FXML
    private ComboBox<String> listIsotop;
    @FXML
    private TextField weight;
    @FXML
    private Button calc;
    @FXML
    private TextField Rad;

    public ArrayList<Isotop> list =new ArrayList();
    public ArrayList<Isotop> list_choised =new ArrayList();
    public ObservableList<Isotop> wordsList = FXCollections.observableArrayList();

    public Stage stage;


    public void initialize(){

        Isotop polonium210 = new Isotop("Polonium 210", (float) 138.0, "day",0.0,(float)210);
        list.add(polonium210);
        Isotop iodine131=new Isotop("Iodine 131", (float) 8.0, "day",0.0,(float)131);
        list.add(iodine131);
        Isotop gadolinium153=new Isotop("Gadolinium 153", (float) 240.0,"day",0.0,(float)153);
        list.add(gadolinium153);
        Isotop tritinium=new Isotop("Tritinum H3", (float) 12.3,"year",0.0,(float)3.016);
        list.add(tritinium);
        Isotop fluorine18 = new Isotop("Fluorine 18", (float) 0.92, "hour",0.0,(float)18);
        list.add(fluorine18);
        Isotop cobalt60 = new Isotop("Cobalt 60", (float) 5.3, "year",0.0,(float)60);
        list.add(cobalt60);
        Isotop strontium90 = new Isotop("Strontium 90", (float) 28.8, "year",0.0,(float)90);
        list.add(strontium90);
        Isotop technetium99 = new Isotop("Technetium 99", (float) 6.0, "hour",0.0,(float)99);
        list.add(technetium99);
        Isotop xenon135 = new Isotop("Xenon 135", (float) 9.1, "hour",0.0,(float)135);
        list.add(xenon135);
        Isotop caesium137 = new Isotop("Caesium 137", (float) 30.2, "year",0.0,(float)137);
        list.add(caesium137);
        Isotop radon222 = new Isotop("Radon 222", (float) 3.8, "day",0.0,(float)222);
        list.add(radon222);
        Isotop plutonium238 = new Isotop("Plutonium 238", (float) 87.7, "year",0.0,(float)238);
        list.add(plutonium238);
        Isotop americium241 = new Isotop("Americium 241", (float) 432, "year",0.0,(float)241);
        list.add(americium241);
        Isotop californium252 = new Isotop("Californium 252", (float) 2.64, "year",0.0,(float)252);
        list.add(californium252);
        Isotop caesium134 = new Isotop("Caesium 134", (float) 2.0, "year",0.0,(float)134);
        list.add(caesium134);
        Isotop krypton85 = new Isotop("Krypton 85", (float) 10.72, "year",0.0,(float)85);
        list.add(krypton85);
        Isotop tellurium132 = new Isotop("Tellurium 132", (float) 3.26, "day",0.0,(float)132);
        list.add(tellurium132);
        Isotop strontium89 = new Isotop("Strontium 89", (float) 50.5, "day",0.0,(float)89);
        list.add(strontium89);
        Isotop rubidium103 = new Isotop("Rubidium 103", (float) 39.3, "day",0.0,(float)103);
        list.add(rubidium103);
        Isotop rubidium106 = new Isotop("Rubidium 106", (float) 368, "day",0.0,(float)106);
        list.add(rubidium106);
        Isotop barium140 = new Isotop("Barium 140", (float) 12.7, "day",0.0,(float)140);
        list.add(barium140);
        Isotop zirconium95 = new Isotop("Zirconium 95", (float) 94, "day",0.0,(float)95);
        list.add(zirconium95);
        Isotop molybdenum99 = new Isotop("Molybdenum 99", (float) 2.75, "day",0.0,(float)99);
        list.add(molybdenum99);
        Isotop cerium141 = new Isotop("Cerium 141", (float) 32.5, "day",0.0,(float)141);
        list.add(cerium141);
        Isotop cerium144 = new Isotop("Cerium 144", (float) 284, "day",0.0,(float)144);
        list.add(cerium144);
        Isotop neptunium239 = new Isotop("Neptunium 239", (float) 2.36, "day",0.0,(float)239);
        list.add(neptunium239);
        Isotop plutonium241 = new Isotop("Plutonium 241", (float) 14.4, "year",0.0,(float)241);
        list.add(plutonium241);



        ArrayList <String> nameIsot =new ArrayList<>();

        for(Iterator <Isotop> s = list.iterator(); s.hasNext(); ) {
            String item = s.next().getName();
            nameIsot.add(item);
        }
         ObservableList<String> listNameIsotop= FXCollections.observableList(nameIsot);
        listIsotop.getItems().addAll(listNameIsotop);


    }

    public void Click(ActionEvent actionEvent)  throws Exception{
        boolean FlYear= false,FlDay=false;
        String min_interval="year";
          for(Iterator <Isotop> s = wordsList.iterator(); s.hasNext(); ) {
            Isotop nextIsot1=s.next();
            if (nextIsot1.getInterval().equals("day"))
                min_interval="day";
              if (nextIsot1.getInterval().equals("hour"))
                  min_interval="hour";
        }
     /*   for(Iterator <Isotop> s = wordsList.iterator(); s.hasNext(); ) {
            Isotop nextIsot1=s.next();
            if (nextIsot1.getInterval().equals("hour"))
                min_interval="hour";
        }*/
        if (min_interval.equals("day")){
            for(Iterator <Isotop> s = wordsList.iterator(); s.hasNext(); ) {
                Isotop nextIsot1=s.next();
                if (nextIsot1.getInterval().equals("year")){
                    FlYear=true;
                    nextIsot1.setInterval("day");
                    nextIsot1.setHalf_life(nextIsot1.getHalf_life()*365);
                }

            }
        }
        if (min_interval.equals("hour")){
            for(Iterator <Isotop> s = wordsList.iterator(); s.hasNext(); ) {
                Isotop nextIsot1=s.next();
                if (nextIsot1.getInterval().equals("year")){
                    FlYear=true;
                    nextIsot1.setInterval("hour");
                    nextIsot1.setHalf_life(nextIsot1.getHalf_life()*365*24);
                }
                if (nextIsot1.getInterval().equals("day")){
                    FlDay=true;
                    nextIsot1.setInterval("hour");
                    nextIsot1.setHalf_life(nextIsot1.getHalf_life()*24);
                }
            }
        }


        double n=-1;
        double n_start=n;
        //defining the axes
        final NumberAxis xAxis = new NumberAxis();
        final NumberAxis yAxis = new NumberAxis();
        final LineChart<Number,Number> lineChart =
                new LineChart<Number,Number>(xAxis,yAxis);
        Scene scene  = new Scene(lineChart,800,600);
        try {
            n=Integer.parseInt(weight.getText());
        }
        catch (Exception e){
            System.out.println("Not number");

        }
        String output = listIsotop.getSelectionModel().getSelectedItem().toString();
        System.out.println(output);
         Float life=(float)-1.0;
         String interval="";

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("a.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();

            lineChart.setTitle("Life of Isotop");


            for(Iterator <Isotop> s = wordsList.iterator(); s.hasNext(); ) {
                XYChart.Series series = new XYChart.Series();
                Isotop nextIsot=s.next();
                output=nextIsot.getName();

                life=nextIsot.getHalf_life();
                interval=nextIsot.getInterval();
                n_start=(nextIsot.getKg()* 6.02)/nextIsot.getMol();
                n=n_start;

                series.setName(output);
                xAxis.setLabel("Number of " + interval );
                int a;
                if (FlYear) a=365;
                else
                if (FlDay) a=24;
                else a=1;
                series.getData().add(new XYChart.Data(1, n));
                for (float t = a; n >n_start/50 ; t=t+a) {
                    n=n_start*Math.pow( 2,-1*t/life);
                    series.getData().add(new XYChart.Data(t, n));

                }
                lineChart.getData().add(series);
            }


            stage = new Stage();
            stage.setScene(new Scene(root1));


            stage.setScene(scene);
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }


        System.out.println(n);
    }

    public void Add(ActionEvent actionEvent) {
        String output = listIsotop.getSelectionModel().getSelectedItem().toString();

        for(Iterator <Isotop> s = list.iterator(); s.hasNext(); ) {
            Isotop Isot=s.next();
            if (Isot.getName().equals(output)){
                if(!wordsList.contains(Isot))
                {
                    Isot.setKg(Double.parseDouble(weight.getText()));
                    wordsList.add(Isot);
                listView1.getItems().clear();
            listView1.getItems().addAll(wordsList);
                }
            }
        }


    }

    @FXML
    void CalcRad(ActionEvent event) {
        double Calc=0;
        for(Iterator <Isotop> s = list.iterator(); s.hasNext(); ) {
            Isotop Isot = s.next();

            if (Isot.getInterval().equals("hour"))
                Calc = Calc + ((6.02*Isot.getKg()/Isot.getMol()) * 0.693 / (Isot.getHalf_life()*3600) *Math.pow( 2, -1 /(Isot.getHalf_life()*3600)))*Math.pow(10,8);
            if (Isot.getInterval().equals("day"))
                Calc = Calc + ((6.02*Isot.getKg()/Isot.getMol()) * 0.693 / (Isot.getHalf_life()*86400) *Math.pow( 2, -1 /(Isot.getHalf_life()*86400)))*Math.pow(10,8);
            if (Isot.getInterval().equals("year"))
                Calc = Calc + ((6.02*Isot.getKg()/Isot.getMol()) * 0.693 / (Isot.getHalf_life()*31536000) *Math.pow( 2, -1 /(Isot.getHalf_life()*31536000)))*Math.pow(10,8);

            Rad.setText(Double.toString(Calc));
        }
    }
}
