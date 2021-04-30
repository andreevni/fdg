package ru.itsjava.collections.lists;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Car extends ArrayListCarShop {
    private String model;
    private double maxSpeed;



    public String getModel() {
        return this.model;
    }

    public double getMaxSpeed() {
        return this.maxSpeed;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }


    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Car)) return false;
        final Car other = (Car) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$model = this.getModel();
        final Object other$model = other.getModel();
        if (this$model == null ? other$model != null : !this$model.equals(other$model)) return false;
        if (Double.compare(this.getMaxSpeed(), other.getMaxSpeed()) != 0) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Car;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $model = this.getModel();
        result = result * PRIME + ($model == null ? 43 : $model.hashCode());
        final long $maxSpeed = Double.doubleToLongBits(this.getMaxSpeed());
        result = result * PRIME + (int) ($maxSpeed >>> 32 ^ $maxSpeed);
        return result;
    }

    public String toString() {
        return "Модель: " + this.getModel() + ", с максимальной скоростью: " + this.getMaxSpeed() + " км/ч!";
    }
}
