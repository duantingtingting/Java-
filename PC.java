package pack1;

public class PC {
CPU cpu;
HardDisk disk;
void setCPU(CPU cpu){
	this.cpu=cpu;
}
void setHardDisk(HardDisk disk){
	this.disk=disk;
}
void show(){
	System.out.println("CPU速度"+cpu.getSpeed());
	System.out.println("硬盘容量"+disk.getAmount());
	System.out.println("硬盘容量（GB）："+disk.getAmount());
	   System.out.println("硬盘转速（转/秒）："+disk.getSpeed());
}
}
