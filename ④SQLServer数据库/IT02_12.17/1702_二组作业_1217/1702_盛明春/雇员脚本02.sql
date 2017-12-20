USE [db_chinese]
GO
/****** Object:  Table [dbo].[雇员01]    Script Date: 12/17/2017 19:37:47 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[雇员01](
	[id] [int] NULL,
	[name] [nvarchar](50) NULL,
	[salary] [money] NULL,
	[department] [nvarchar](50) NULL,
	[dateline] [date] NULL,
	[recommend] [bit] NULL
) ON [PRIMARY]
GO
