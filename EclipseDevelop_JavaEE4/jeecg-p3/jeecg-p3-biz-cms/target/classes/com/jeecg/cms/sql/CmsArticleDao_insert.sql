INSERT  INTO
	cms_article
      ( 
      id                            
      ,title                          
      ,image_href                     
      ,summary                        
      ,content                        
      ,column_id                      
      ,create_name                    
      ,create_by                      
      ,create_date                    
      ,publish                        
      ,PUBLISH_DATE                   
      ,AUTHOR                         
      ,LABEL                          
      ) 
values
      (
      :cmsArticle.id                            
      ,:cmsArticle.title                         
      ,:cmsArticle.imageHref                     
      ,:cmsArticle.summary                       
      ,:cmsArticle.content                       
      ,:cmsArticle.columnId                      
      ,:cmsArticle.createName                    
      ,:cmsArticle.createBy                      
      ,:cmsArticle.createDate                    
      ,:cmsArticle.publish                       
      ,:cmsArticle.publishDate                   
      ,:cmsArticle.author                        
      ,:cmsArticle.label                         
      )