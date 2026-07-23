class MyCalendar {

    List<int[]> bookings = new ArrayList<>();;

    public MyCalendar() {
    }

    public boolean book(int start, int end) {

        for (int[] booking : bookings) {
            if (start < booking[1] && end > booking[0]) {
                return false;
            }
        }

        bookings.add(new int[]{start, end});
        return true;
    }
}