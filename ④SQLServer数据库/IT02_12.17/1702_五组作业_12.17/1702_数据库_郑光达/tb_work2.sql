USE [db_work]
GO
/****** Object:  Table [dbo].[tb_work2]    Script Date: 12/17/2017 17:59:41 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tb_work2](
	[id] [int] NOT NULL,
	[salary] [money] NOT NULL,
	[name] [nchar](10) NOT NULL,
	[age] [int] NOT NULL,
	[dateline] [date] NOT NULL,
	[recommend] [bit] NOT NULL,
	[department] [nvarchar](50) NOT NULL,
	[remarks] [ntext] NOT NULL,
 CONSTRAINT [PK_tb_work2] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
