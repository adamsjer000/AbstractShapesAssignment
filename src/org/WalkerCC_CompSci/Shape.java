package org.WalkerCC_CompSci;

public abstract class Shape {

    protected Point[] listOfPoints;

    public double GetSideLength(int sideLengthNumber){
        if(sideLengthNumber >= listOfPoints.length - 1){
            return CalculateSideLength(listOfPoints[listOfPoints.length - 1], listOfPoints[0]);
        }
        else if(sideLengthNumber < 0){
            return CalculateSideLength(listOfPoints[0], listOfPoints[1]);
        }
        else{
            return CalculateSideLength(listOfPoints[sideLengthNumber], listOfPoints[sideLengthNumber + 1]);
        }
    }

    private double CalculateSideLength(Point point0, Point point1){

        double horizontalDistance = Math.pow(2,(point0.getX()-point1.getX()));
        double verticalDistance = Math.pow(2,(point0.getY()- point1.getY()));
        double totalDistance = horizontalDistance+verticalDistance;

        return Math.sqrt(totalDistance);
    }

    public double GetPerimeter(){
        double sum = 0;
        for(int i = 0; i < listOfPoints.length; i++){
            sum += GetSideLength(i);
        }
        return sum;
    }



}
