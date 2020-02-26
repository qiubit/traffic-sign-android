package org.pytorch.demo;

public class Constants {
  public static final String TAG = "PyTorchDemo";

  public static String[] GTSRB_CLASSES = new String[]{
      "Ahead_only",
      "Beware_of_icesnow",
      "Bicycles_crossing",
      "Bumpy_road",
      "Children_crossing",
      "Dangerous_curve_to_the_left",
      "Dangerous_curve_to_the_right",
      "Double_curve",
      "End_of_all_speed_and_passing_limits",
      "End_of_no_passing",
      "End_of_no_passing_by_vehicles_over_3.5_metric_tons",
      "End_of_speed_limit_80kmh",
      "General_caution",
      "Go_straight_or_left",
      "Go_straight_or_right",
      "Keep_left",
      "Keep_right",
      "No_entry",
      "No_passing",
      "No_passing_for_vehicles_over_3.5_metric_tons",
      "No_vehicles",
      "Pedestrians",
      "Priority_road",
      "Right-of-way_at_the_next_intersection",
      "Road_narrows_on_the_right",
      "Road_work",
      "Roundabout_mandatory",
      "Slippery_road",
      "Speed_limit_100kmh",
      "Speed_limit_120kmh",
      "Speed_limit_20kmh",
      "Speed_limit_30kmh",
      "Speed_limit_50kmh",
      "Speed_limit_60kmh",
      "Speed_limit_70kmh",
      "Speed_limit_80kmh",
      "Stop",
      "Traffic_signals",
      "Turn_left_ahead",
      "Turn_right_ahead",
      "Vehicles_over_3.5_metric_tons_prohibited",
      "Wild_animals_crossing",
      "Yield",
  };

  public static float[] GTSRB_MEAN = new float[]{0.36f, 0.3243f, 0.3263f};
  public static float[] GTSRB_STD = new float[]{0.2793f, 0.2634f, 0.2675f};
}
