select salesid,ime_no,sales_date from sales_info where to_char(sales_date,'MM-YYYY')='02-2012' order by salesid;