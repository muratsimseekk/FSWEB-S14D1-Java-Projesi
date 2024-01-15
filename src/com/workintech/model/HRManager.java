package com.workintech.model;

public class HRManager extends Employee{

    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
        this.juniorDevelopers = new JuniorDeveloper[4];
        this.midDevelopers = new MidDeveloper[3];
        this.seniorDevelopers = new SeniorDeveloper[2];
    }

    public void addEmployee(JuniorDeveloper juniorDeveloper) {
        addDeveloper(juniorDevelopers, juniorDeveloper);
    }

    public void addEmployee(MidDeveloper midDeveloper) {
        addDeveloper(midDevelopers, midDeveloper);
    }

    public void addEmployee(SeniorDeveloper seniorDeveloper) {
        addDeveloper(seniorDevelopers, seniorDeveloper);
    }

    private void addDeveloper(Employee[] developers, Employee developer) {

            for (int i = 0; i < developers.length; i++) {
                boolean isExist = false;
                if (developers[i] == null) {
                    developers[i] = developer;
                    System.out.println(developer.getName() + " eklendi .");
                    break;

                } else if (developers[i].getId() == developer.getId()) {
                    isExist = true;
                    System.out.println("Employee with ID " + developer.getId() + " already exists.");
                    break;

                }
                else {
                    System.out.println("No space available for new employee.");
                    break;
                }
            }



    }

    @Override
    public void work() {
        System.out.println("HR Manager " + getName() + " starts to working");
    }
}
