public String alarmClock(int day, boolean vacation) {
  String alarm = "";

  if (!vacation) {
    if (day < 6 && day > 0) {
      alarm = "7:00";
    } else {
      alarm = "10:00";
    }
  } else {
    if (day < 6 && day > 0) {
      alarm = "10:00";
    } else {
      alarm = "off";
    }  }
  return alarm;
}

