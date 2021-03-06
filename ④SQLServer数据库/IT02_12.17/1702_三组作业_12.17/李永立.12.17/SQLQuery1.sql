USE [db_ employee]
GO
/****** Object:  Table [dbo].[tb_employee]    Script Date: 12/17/2017 19:36:43 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tb_employee](
	[id] [int] NOT NULL,
	[name] [nvarchar](32) NOT NULL,
	[salary] [money] NOT NULL,
	[dateline] [date] NOT NULL,
	[recommend] [bit] NOT NULL,
	[department] [nvarchar](16) NOT NULL,
 CONSTRAINT [PK_tb_employee] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
