%dw 2.0
output text/plain
---
payload.employee.first_name ++  ' ' ++ payload.employee.last_name ++ ' '
++ 'was created successfully. (Employee ID : ' ++ payload.employee.id  ++ ')'