package UserInput;

public class PaintJob {
    public static void main(String[] args) {
        System.out.println( getBucketCount(3.4, 2.1, 1.5, 2) + " //3" );
        System.out.println( getBucketCount(7.25, 4.3, 2.35)+ " //14");
        System.out.println( getBucketCount(3.26, 0.75) + " //5");
    }
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        double area = width * height;
        //Tim's approach
        double remainingArea = area - (extraBuckets * areaPerBucket);
        return getBucketCount(remainingArea, areaPerBucket);

        /*  // my solution
        return ( getBucketCount(area, areaPerBucket) - extraBuckets);
        */
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        if (width <= 0 || height <= 0 || areaPerBucket  <= 0 ) {
            return -1;
        }
        return getBucketCount(width, height, areaPerBucket, 0);
    }

    public static int getBucketCount(double area, double areaPerBucket){
        if (area <= 0 || areaPerBucket  <= 0 ) {
            return -1;
        }
        return (int) Math.ceil(area / areaPerBucket);
    }
}
