##查詢出用戶的權限與菜單
SELECT DISTINCT
	erp.PERM_ID AS estBsPermId,
	erp.PERM_CODE AS permCode,
	erp.PERM_NAME AS permName
FROM
	est_bs_role_perm erp
WHERE
	erp.ROLE_ID IN (
		EXISTS (
			SELECT
				er.ROLE_ID
			FROM
				est_bs_emp_role er
			WHERE
				er.emp_id = ?
		)
	)