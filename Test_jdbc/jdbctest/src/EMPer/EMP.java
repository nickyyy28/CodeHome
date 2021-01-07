package EMPer;

import java.util.Date;

public class EMP {
    private int id;
    private String ename;
    private int job_id;
    private int mqr;
    private Date join_day;
    private double salary;
    private double bouns;
    private int dept_id;

    public EMP(int id, String ename, int job_id, int mqr, Date join_day, double salary, double bouns, int dept_id) {
        this.id = id;
        this.ename = ename;
        this.job_id = job_id;
        this.mqr = mqr;
        this.join_day = join_day;
        this.salary = salary;
        this.bouns = bouns;
        this.dept_id = dept_id;
    }

    @Override
    public String toString() {
        return "EMP{" +
                "id=" + id +
                ", ename='" + ename + '\'' +
                ", job_id=" + job_id +
                ", mgr=" + mqr +
                ", join_day=" + join_day +
                ", salary=" + salary +
                ", bouns=" + bouns +
                ", dept_id=" + dept_id +
                '}'+"\n";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getJob_id() {
        return job_id;
    }

    public void setJob_id(int job_id) {
        this.job_id = job_id;
    }

    public int getMqr() {
        return mqr;
    }

    public void setMqr(int mqr) {
        this.mqr = mqr;
    }

    public Date getJoin_day() {
        return join_day;
    }

    public void setJoin_day(Date join_day) {
        this.join_day = join_day;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBouns() {
        return bouns;
    }

    public void setBouns(double bouns) {
        this.bouns = bouns;
    }

    public int getDept_id() {
        return dept_id;
    }

    public void setDept_id(int dept_id) {
        this.dept_id = dept_id;
    }
}
