package EMPer;

import java.util.Date;

public class EMP {
    private Integer id;
    private String ename;
    private Integer job_id;
    private Integer mgr;
    private Date joinday;
    private Double salary;
    private Double bouns;
    private Integer dept_id;

    @Override
    public String toString() {
        return "EMP{" +
                "id=" + id +
                ", ename='" + ename + '\'' +
                ", job_id=" + job_id +
                ", mgr=" + mgr +
                ", joinday=" + joinday +
                ", salary=" + salary +
                ", bouns=" + bouns +
                ", dept_id=" + dept_id +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public EMP() {
    }

    public Integer getJob_id() {
        return job_id;
    }

    public void setJob_id(Integer job_id) {
        this.job_id = job_id;
    }

    public Integer getMgr() {
        return mgr;
    }

    public void setMgr(Integer mgr) {
        this.mgr = mgr;
    }

    public Date getJoinday() {
        return joinday;
    }

    public void setJoinday(Date joinday) {
        this.joinday = joinday;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double getBouns() {
        return bouns;
    }

    public void setBouns(Double bouns) {
        this.bouns = bouns;
    }

    public Integer getDept_id() {
        return dept_id;
    }

    public void setDept_id(Integer dept_id) {
        this.dept_id = dept_id;
    }

    public EMP(Integer id, String ename, Integer job_id, Integer mgr, Date joinday, Double salary, Double bouns, Integer dept_id) {
        this.id = id;
        this.ename = ename;
        this.job_id = job_id;
        this.mgr = mgr;
        this.joinday = joinday;
        this.salary = salary;
        this.bouns = bouns;
        this.dept_id = dept_id;
    }
}
