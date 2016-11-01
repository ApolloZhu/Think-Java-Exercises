//
//  Rectangle.java.h
//  Chapter11
//
//  Created by Apollo Zhu on 8/13/16.
//  Copyright © 2015-2016 WWITDC. All rights reserved.
//

public class Rectangle extends Rectangle2D implements Shape, java.io.Serializable{

    //?_?
    private static native void initIDs();

    // Pure
    public double getX()
    public double getY()
    public double getWidth()
    public double getHeight()
    public Rectangle getBounds()
    public Rectangle2D getBounds2D()
    private static int clip(double v, boolean doceil)
    public Point getLocation()
    public Dimension getSize()
    public boolean contains(Point p)
    public boolean contains(int x, int y)
    public boolean contains(Rectangle r)
    public boolean contains(int X, int Y, int W, int H)
    @Deprecated public boolean inside(int X, int Y)
    public boolean intersects(Rectangle r)
    public Rectangle intersection(Rectangle r)
    public Rectangle union(Rectangle r)
    public boolean isEmpty()
    public int outcode(double x, double y)
    public Rectangle2D createIntersection(Rectangle2D r)
    public Rectangle2D createUnion(Rectangle2D r)
    public boolean equals(Object obj)
    public String toString()

    // Modifier
    public void setBounds(Rectangle r)
    public void setBounds(int x, int y, int width, int height)
    public void setRect(double x, double y, double width, double height)
    @Deprecated public void reshape(int x, int y, int width, int height)
    public void setLocation(Point p)
    public void setLocation(int x, int y)
    @Deprecated public void move(int x, int y)
    public void translate(int dx, int dy)
    public void setSize(Dimension d)
    public void setSize(int width, int height)
    @Deprecated public void resize(int width, int height)
    public void add(int newx, int newy)
    public void add(Point pt)
    public void add(Rectangle r)
    public void grow(int h, int v)

}
