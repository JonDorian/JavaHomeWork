package com.tms.lesson11.computer;

//Книга Блинов/Романчик, задания к Главе 5, Вариант А №15.
//Создать класс Computer с внутренним классом, с помощью объектов которого можно хранить информацию об
//операционной системе, процессоре и оперативной памяти.

public class Computer {
  private String computerType;

  Computer() {
    computerType = "игровой";
  }

  Computer(String computerType) {
    this.computerType = computerType;
  }

  class ComputerInfo {
    private String operationSystemType;
    private String processorName;
    private float frequencyStock;
    private float frequencyTurbo;
    private String ramType;
    private int ramSize;

    ComputerInfo() {
      this.operationSystemType = "Windows 10";
      this.processorName = "Ryzen 9";
      this.frequencyStock = 3.7f;
      this.frequencyTurbo = 4.8f;
      this.ramType = "DDR 4";
      this.ramSize = 8;
    }

    ComputerInfo(String operationSystemType, String processorName, double frequencyStock, double frequencyTurbo,
                 String ramType, int ramSize) {
      setOperationSystemType(operationSystemType);
      setProcessorName(processorName);
      setFrequencyStock(frequencyStock);
      setFrequencyTurbo(frequencyTurbo);
      setRamType(ramType);
      setRamSize(ramSize);
    }

    public void setOperationSystemType(String operationSystemType) {
      this.operationSystemType = operationSystemType;
    }

    public String getOperationSystemType() {
      return operationSystemType;
    }

    public void setProcessorName(String processorName) {
      this.processorName = processorName;
    }

    public String getProcessorName() {
      return processorName;
    }

    public void setFrequencyStock(double frequencyStock) {
      this.frequencyStock = (float) frequencyStock;
    }

    public float getFrequencyStock() {
      return frequencyStock;
    }

    public void setFrequencyTurbo(double frequencyTurbo) {
      this.frequencyTurbo = (float) frequencyTurbo;
    }

    public float getFrequencyTurbo() {
      return frequencyTurbo;
    }

    public void setRamType(String ramType) {
      this.ramType = ramType;
    }

    public String getRamType() {
      return ramType;
    }

    public void setRamSize(int ramSize) {
      this.ramSize = ramSize;
    }

    public int getRamSize() {
      return ramSize;
    }

    public void getFullInfo() {
      System.out.println("Тип компьютера:  " + computerType + "\nТип операционной системы: " + getOperationSystemType() +
              "\nУстановленный процессор: " + getProcessorName() + "\nСтоковая частота: " + getFrequencyStock() +
              "ГГц\nТурбо-частота: " + getFrequencyTurbo() + "ГГц\nТип оперативной памяти: " + getRamType() +
              "\nОбъем оперативной памяти: " + getRamSize() + "Гб");
      System.out.println();
    }
  }
}