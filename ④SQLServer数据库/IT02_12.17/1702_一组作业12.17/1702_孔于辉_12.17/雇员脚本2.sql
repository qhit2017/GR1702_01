USE [db_employee]
GO
/****** Object:  Table [dbo].[tb_employee2]    Script Date: 12/17/2017 19:21:32 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tb_employee2](
	[id] [nchar](5) NOT NULL,
	[name] [nchar](6) NOT NULL,
	[dateline] [date] NOT NULL,
	[salary] [money] NOT NULL,
	[recommend] [bit] NOT NULL,
	[department] [nchar](16) NULL,
	[remark] [ntext] NULL,
 CONSTRAINT [PK_tb_employee2] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
