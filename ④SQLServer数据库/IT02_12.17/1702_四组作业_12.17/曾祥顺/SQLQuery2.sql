USE [db_worker]
GO
/****** Object:  Table [dbo].[tb_salary]    Script Date: 12/17/2017 18:54:01 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tb_salary](
	[id] [int] NOT NULL,
	[name] [nchar](10) NOT NULL,
	[salary] [money] NOT NULL,
 CONSTRAINT [PK_tb_salary] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
