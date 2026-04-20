
```Text
Việc đặt fuelLevel và batteryPercent trong một class Vehicle đã vi phạm ISP
Giải pháp: Tách Vehicle thành GasVehicle và ElectronicVehicle

Phương thức getInfo() của các lớp con gần như giống hệt nhau và chỉ khác loại xe
Giải pháp: đưa lên lớp cha, nhận tham số type
