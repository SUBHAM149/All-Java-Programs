void main()
{
    String days = IO.readln().toUpperCase();

    String result = switch (days)
    {
        case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" ->
                "is a Weekday";

        case "SATURDAY", "SUNDAY" ->
                "is a Weekend";

        default ->
                "is not a valid Day";
    };

    IO.println(days + " " + result);
}
