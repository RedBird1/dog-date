SELECT o.name AS "Name", p.bio AS "Bio" 
	FROM OWNERS o JOIN PROFILES p 
		ON o.owner# = p.owner#;