package Runner;

	import java.util.Arrays;
	import javafx.application.Application;
	import javafx.collections.FXCollections;
	import javafx.scene.Scene;
	import javafx.scene.chart.CategoryAxis;
	import javafx.scene.chart.NumberAxis;
	import javafx.scene.chart.StackedBarChart;
	import javafx.scene.chart.XYChart;
	import javafx.stage.Stage;
	 
	//Yiren Mai
	//Lab 4.2
	public class csvgraph extends Application {
	 
	    final static String first = "reading scores";
	    final static String second = "math scores";
	    final static String third = "writing scores";
	    final CategoryAxis xAxis = new CategoryAxis();
	    final NumberAxis yAxis = new NumberAxis();
	    final StackedBarChart<String, Number> sbc =
	            new StackedBarChart<String, Number>(xAxis, yAxis);
	    final XYChart.Series<String, Number> metric =
	            new XYChart.Series<String, Number>();
	 
	    @Override
	    public void start(Stage stage) {
	        stage.setTitle("2012 Highest Sat Scores");
	        
	        sbc.setTitle("2012 Highest sat Scores");
	        xAxis.setLabel("scores");
	        xAxis.setCategories(FXCollections.<String>observableArrayList( Arrays.asList(first,second,third)));
	        
	        yAxis.setLabel("Scores");
	        
	        metric.setName("Section");
	        metric.getData().add(new XYChart.Data<String, Number>(first, 679));
	        metric.getData().add(new XYChart.Data<String, Number>(second, 735));
	        metric.getData().add(new XYChart.Data<String, Number>(third, 682));
	        
	        Scene scene = new Scene(sbc, 750, 750);
	        sbc.getData().addAll(metric);
	        stage.setScene(scene);
	        stage.show();
	    }
	 
	    public static void main(String[] args) {
	        launch(args);
	    }
	}
